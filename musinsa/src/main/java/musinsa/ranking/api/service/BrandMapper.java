package musinsa.ranking.api.service;


import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface BrandMapper {


	public int add(BrandVo vo);

	public int edit(BrandVo vo);

	public int del(BrandVo vo);


}
