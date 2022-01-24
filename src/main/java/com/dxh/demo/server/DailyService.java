package com.dxh.demo.server;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * @author 百莫
 * @create 2021/12/21
 */
public class DailyService {
    public static void main(String[] args) {


        Long lll = null;

        BigDecimal bigDecimal1 = null;
        bigDecimal1 = new BigDecimal("123");
        String st = Joiner.on("|").useForNull("null").join("SPLIT_CHAR","1","2");
        String st2 = "12" + "|" + "123" + "|" + "413";
        String st3 = Joiner.on("\\|").useForNull("null").join("SPLIT_CHAR","1","2");


        Splitter.on("|").splitToList(st);
        Map<String,EmployPojo> employPojoMap = Maps.newHashMap();
        employPojoMap.put("1",EmployPojo.builder().age(12).build());
        employPojoMap.put("2",EmployPojo.builder().age(31).build());
        String json = JSONObject.toJSONString(employPojoMap);

        Map<String,EmployPojo> employPojoMap1 = JSON.parseObject(json,new TypeReference<Map<String,EmployPojo>>(){});

        List<EmployPojo> employPojos = Lists.newArrayList(EmployPojo.builder().age(12).build(),EmployPojo.builder().age(32).build(),EmployPojo.builder().age(43).build());
        employPojos.stream().max(Comparator.comparing(employPojo-> employPojo.getAge())).get();

        List<String> al = Lists.newArrayList("123","311");
        al.stream().map(it-> {
            EmployPojo employPojo = null;
            return employPojo;
        }).max(Comparator.comparing(employPojo -> employPojo.getAge())).get();

        //保留小数
        DecimalFormat def = new DecimalFormat("0.#");
        String yuan = def.format(12.34);

        BigDecimal bigDecimal = new BigDecimal("12.3");
        BigDecimal bigDecimal2 = new BigDecimal("0");
        bigDecimal.movePointRight(2).setScale(1,RoundingMode.HALF_UP).doubleValue();

        Splitter splitter =Splitter.on(CharMatcher.anyOf("\\|"))
            .trimResults()
            .omitEmptyStrings();
        String mqS = "1458223503645789185|662114101004|2209331833365|taote_2212762585039|2212727976668|2212762585039|2021-12-21 16:35:28||99|1458223503645789185|1000|753794,4491,1844738,16395,1620354,7046,18379,234241,245697,294785,23563,1800834,23883,25346,426754,293057,241218,267649,1611,299713,1787970,235841,273601,11143,1843202,11467,2038338,2507,1648514,241985,2094402,290433,1630402,1915138,5190,7371,206977,2635,4619,159170,843,91713,4811,291649,2126210,11083,260033,260673,2059010,1163,8395,2096194,651,1978370,1035,1781570,1681218,104514,6603,2017858,309953,18955,87361,18763,1680706,104130,302209,246017,1965378,310273,1632962,2064514,225857,23755,1789506,11339,32578,1826754,1792066,36610,1900354,266177,7947,1846146,2122242,11974|127688031|2021-12-21 16:35:35.430|2200735788591|1000.0|1590.0|590.0|1.0";
        splitter.splitToList(mqS);


        Object dou = 0.0;

        Long value1 = ((Double) dou).longValue();
        boolean bo = value1 >= -11676066610000L && value1 <= 253402271999000L;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String sql = "".trim().toLowerCase();
        List<String> str = Lists.newArrayList("truncate", "update", "insert", "drop", "rename", "alter");
        for (int i = 0; i < str.size(); i++) {
            if (sql.indexOf(str.get(i)) > -1) {
                return;
            }
        }
        if (sql.contains("delete")) {
            Integer index = sql.indexOf("delete");

        }


        List<String> list2312 = Lists.newArrayList("1", "3", "5", "7", "8", "0");

        Map<String, List<String>> asdaMap = Maps.newHashMap();
        list2312.forEach(it -> {
            asdaMap.computeIfAbsent("ada", k -> Lists.newArrayList()).add(it);
        });
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("US/Pacific-New")));
        System.out.println("US/Pacific-New: " + cal.getTime());

        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("Asia/Shanghai")));
        cal1.setTimeInMillis(1626660000000L);
        System.out.println("Asia/Shanghai: " + cal1.getTime());

        String s1 = "select * from mt_data where tenant_id = '%s'";
        s1 = s1.replace("where", " LEFT JOIN mt_data_extra e ON d.tenant_id = e.tenant_id AND d.id = e.data_id where");


        String sql213 = "select * from mt_data where id in ('%s')";
        List<String> ids = Lists.newArrayList("1", "2", "3", "4");
        String sql1 = String.format(sql, String.join("','", ids));

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.poll();
        queue.offer("d");
        queue.poll();

        List<EmployPojo> linkedList = Lists.newArrayList();
        linkedList.add(EmployPojo.builder().age(11).build());
        linkedList.add(EmployPojo.builder().age(8).build());
        linkedList.add(EmployPojo.builder().age(18).build());
        Collections.sort(linkedList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                EmployPojo entity1 = (EmployPojo) o1;
                EmployPojo entity2 = (EmployPojo) o2;
                if (true ? (entity1.getAge() > entity2.getAge()) : (entity1.getAge() > entity2.getAge())) {
                    return -1;
                } else if (true ? (entity1.getAge().equals(entity2.getAge())) : (entity1.getAge().equals(entity2.getAge()))) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        AtomicReference<String> id = new AtomicReference<>();
        id.set("121");
        id.get();
        id.set("342");
        id.get();

        Long l = 123L;
        Map<String, Object> maps = Maps.newHashMap();
        maps.put("l", l);
        Object l1 = maps.get("l");

        String[] value = new String[10];

        Map<String, List<String>> map = new HashMap<String,List<String>>() {
            {
                put("1", Lists.newArrayList("1", "2"));
                put("2", Lists.newArrayList("3", "4"));
                put("3", Lists.newArrayList("5", "6"));
            }
        };

        map.keySet();
        map.values();

        Set<String> s = Sets.newHashSet();
        map.values().stream().forEach(it -> s.addAll(it));
        System.out.println(s);


        List<EmployPojo> list = Lists.newArrayList(EmployPojo.builder().name("a").build(), EmployPojo.builder().name("b").build(), EmployPojo
            .builder()
            .name("c")
            .build(), EmployPojo.builder().name("A").build());
        List<String> list1 = list.stream().map(it -> it.getName()).map(String::toLowerCase).collect(Collectors.toList());
        long count = list1.stream().distinct().count();
        System.out.println(count);
        System.out.println(list);


        List<String> a1 = Lists.newArrayList("a", "b", "c", "d", "e", "f", "g");

        Lists.partition(a1, 0 / 100);
        List<String> a2 = Lists.newArrayList("a", "d");
        a1 = a1.stream().filter(it -> a2.contains(it)).collect(Collectors.toList());
        if (a1.contains(a2)) {
            System.out.println(true);
        }
    }
}
