package FactoryPattern;

import org.apache.commons.lang3.StringUtils;

public class SimpleFactory {
    //코드 개선 전
    static IProduct makeProduct(String productName) {
        if ("ProductA".equals(productName)) {
            return new ProductA();
        } else if ("ProductB".equals(productName)) {
            return new ProductB();
        } else {
            return null;
        }
    }
    // 코드 개선 후
//    static IProduct makeProduct(String className) {
//        try {
//            if (!StringUtils.isEmpty(className)) {
//                return (IProduct) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
