package com.dns007.news.strategy;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/22
 */
public class StrategyB implements Strategy {
    @Override
    public double cost(double num) {
        if(num >= 200){
            return  num-50;
        }
        return num;
    }
}
