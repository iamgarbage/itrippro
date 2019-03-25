package cn.itrip.beans;

import cn.itrip.beans.pojo.ItripHotel;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import javax.management.Query;
import java.util.List;

public class TestSolr {
    //请求的路径
    private static String url="http://localhost:8081/solr/itrip_core/";

    public static void main(String[] args){
        //创建HttpSolrServer
        HttpSolrServer solrServer = new HttpSolrServer(url);
        //配置解析器
        solrServer.setParser(new XMLResponseParser());
        solrServer.setConnectionTimeout(500);

        //设置查询参数
        SolrQuery query =new SolrQuery("*:*");  //设置Q的查询方式
        query.setQuery("*:*");          //设置Q的查询方式
        //设置fq
        //query.setFilterQueries();
        query.setSort("id",SolrQuery.ORDER.desc);
        query.setStart(0);      //从第一条数据开始
        query.setRows(5);       //查询5条数据

        //接收返回数据 转化成对象 queryResponse
        List<ItripHotel> itripHotels;
        try {
            QueryResponse response =solrServer.query(query);
            itripHotels = response.getBeans(ItripHotel.class);
            for (int i=0;i<itripHotels.size();i++){
                System.out.println(itripHotels.get(i).getAddress());
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
    }
}

