package musinsa.ranking.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface ProductMapper {

	public ArrayList<HashMap<String, String>> getMinPriceProductListByCategoryAndSum(HashMap<String, String> map);

	public ArrayList<HashMap<String, String>> getLowestPriceBrandOfAllCategory(HashMap<String, String> map);

	public ArrayList<HashMap<String, String>> getMinPriceProductListByCategory(HashMap<String, String> map);

	public ArrayList<HashMap<String, String>> getMaxPriceProductListByCategory(HashMap<String, String> map);

	public int del(HashMap<String, Integer> map);

	public int add(ProductVo vo);

	public int edit(ProductVo vo);

	public int del(ProductVo vo);

}
