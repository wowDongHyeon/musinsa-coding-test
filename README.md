# shopping-api-project

<버전>
1. java version : jdk1.8
2. tomcat version : 8.0
3. postgrsel version : 10


<구동>

1. IDE에 위 repository 내려받은 후 구동해주세요.
2. 구동할 때, 제 로컬 DB에 자동으로 연결됩니다.


<DB 테이블 DDL>

1. 브랜드 테이블

      -- Table: musinsa.brand

      -- DROP TABLE musinsa.brand;

      CREATE TABLE musinsa.brand
      (
        pkey bigserial NOT NULL, -- 식별번호
        brand_name text NOT NULL, -- 브랜드명
        CONSTRAINT brand_pkey PRIMARY KEY (pkey),
        CONSTRAINT brand_brand_name_key UNIQUE (brand_name)
      )
      WITH (
        OIDS=FALSE
      );
      ALTER TABLE musinsa.brand
        OWNER TO postgres;
      COMMENT ON TABLE musinsa.brand
        IS '브랜드';
      COMMENT ON COLUMN musinsa.brand.pkey IS '식별번호';
      COMMENT ON COLUMN musinsa.brand.brand_name IS '브랜드명';


2. 카테고리 테이블
      -- Table: musinsa.category

      -- DROP TABLE musinsa.category;

      CREATE TABLE musinsa.category
      (
        pkey bigserial NOT NULL, -- 식별번호
        category_name text NOT NULL, -- 카테고리명
        CONSTRAINT category_pkey PRIMARY KEY (pkey),
        CONSTRAINT category_category_name_key UNIQUE (category_name)
      )
      WITH (
        OIDS=FALSE
      );
      ALTER TABLE musinsa.category
        OWNER TO postgres;
      COMMENT ON TABLE musinsa.category
        IS '카테고리';
      COMMENT ON COLUMN musinsa.category.pkey IS '식별번호';
      COMMENT ON COLUMN musinsa.category.category_name IS '카테고리명';



3. 상품 테이블
      -- Table: musinsa.product

      -- DROP TABLE musinsa.product;

      CREATE TABLE musinsa.product
      (
        pkey bigserial NOT NULL, -- 식별번호
        brand_name text NOT NULL, -- 브랜드명
        category_name text NOT NULL, -- 카테고리명
        product_name text NOT NULL, -- 상품명
        product_price bigint NOT NULL, -- 상품가격
        CONSTRAINT product_pkey PRIMARY KEY (pkey),
        CONSTRAINT product_brand_name_fkey FOREIGN KEY (brand_name)
            REFERENCES musinsa.brand (brand_name) MATCH SIMPLE
            ON UPDATE NO ACTION ON DELETE NO ACTION,
        CONSTRAINT product_category_name_fkey FOREIGN KEY (category_name)
            REFERENCES musinsa.category (category_name) MATCH SIMPLE
            ON UPDATE NO ACTION ON DELETE NO ACTION
      )
      WITH (
        OIDS=FALSE
      );
      ALTER TABLE musinsa.product
        OWNER TO postgres;
      COMMENT ON TABLE musinsa.product
        IS '상품';
      COMMENT ON COLUMN musinsa.product.pkey IS '식별번호';
      COMMENT ON COLUMN musinsa.product.brand_name IS '브랜드명';
      COMMENT ON COLUMN musinsa.product.category_name IS '카테고리명';
      COMMENT ON COLUMN musinsa.product.product_name IS '상품명';
      COMMENT ON COLUMN musinsa.product.product_price IS '상품가격';


