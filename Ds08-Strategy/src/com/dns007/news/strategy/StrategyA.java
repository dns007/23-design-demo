package com.dns007.news.strategy;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/22
 */
public class StrategyA implements Strategy {
    @Override
    public double cost(double num) {
        return num*0.8;
    }
}
