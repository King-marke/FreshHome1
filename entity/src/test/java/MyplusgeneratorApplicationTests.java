import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


class MyplusgeneratorApplicationTests {


    public static void main(String[] args) {
        GlobalConfig config=new GlobalConfig();

        config.setOutputDir("E:\\ACCP\\FreshHome\\entity\\src\\main\\java")//生成的路径
                .setFileOverride(true)//文件覆盖
                .setIdType(IdType.AUTO)//主键策略
                //.setServiceName("%sService")//首字母是否为I，$s不生成I
                //.setBaseResultMap(true)
                //.setBaseColumnList(true)
                .setAuthor("XQK");

        DataSourceConfig dsConfig=new DataSourceConfig();
        dsConfig.setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://120.77.240.238:3306/xianhome?serverTimezone=UTC")
                .setUsername("root")
                .setPassword("root")
                .setDbType(DbType.MYSQL);

        StrategyConfig stConfig=new StrategyConfig();
        stConfig.setCapitalMode(true)//全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//数据表映射到实体的命名策略
                .setInclude("flowers_users","flowers_user_integral","flowers_user_coupons","flowers_tongyongimg",
                        "flowers_subscribe","flowers_shopping","flowers_shipping_address","flowers_says_type","flowers_picture",
                        "flowers_orders_details","flowers_order_message_type","flowers_order_message_information","flowers_order",
                        "flowers_language_type","flowers_language","flowers_label","flowers_integral_type","flowers_fresh","flowers_fathertow",
                        "flowers_fatherthree_price","flowers_fatherthere_use","flowers_fatherthere_type","flowers_fatherthere_role",
                        "flowers_fatherthere_material","flowers_fatherone","flowers_evaluation","flowers_coupons","flowers_collection");

        PackageConfig pkConfig=new PackageConfig();
        pkConfig.setParent("com.xj")
                /*.setMapper("mapper")
                .setService("service")
                .setController("controller")*/
                .setEntity("pojo");
                //.setXml("mapper");

        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine())
                .setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        mpg.execute();
    }
}
