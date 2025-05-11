--
-- PostgreSQL database dump
--

-- Dumped from database version 17.4
-- Dumped by pg_dump version 17.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    id integer NOT NULL,
    isbn character varying(50) NOT NULL,
    author character varying(200) NOT NULL,
    publisher character varying(200) NOT NULL
);


ALTER TABLE public.book OWNER TO postgres;

--
-- Name: category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.category (
    categoryid integer NOT NULL,
    categoryname character varying(100) NOT NULL
);


ALTER TABLE public.category OWNER TO postgres;

--
-- Name: customer; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.customer (
    customerid integer NOT NULL,
    customername character varying(200) NOT NULL,
    firstname character varying(50) NOT NULL,
    lastname character varying(50) NOT NULL,
    gender character varying(10),
    cardnumber character varying(50),
    email character varying(50),
    phone character varying(50),
    address text,
    CONSTRAINT customer_gender_check CHECK (((gender)::text = ANY ((ARRAY['Male'::character varying, 'Female'::character varying, 'Other'::character varying])::text[])))
);


ALTER TABLE public.customer OWNER TO postgres;

--
-- Name: manager; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.manager (
    managerid integer NOT NULL,
    managername character varying(200) NOT NULL,
    email character varying(50),
    phone character varying(50),
    gender character varying(10),
    CONSTRAINT manager_gender_check CHECK (((gender)::text = ANY ((ARRAY['Male'::character varying, 'Female'::character varying, 'Other'::character varying])::text[])))
);


ALTER TABLE public.manager OWNER TO postgres;

--
-- Name: orders; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orders (
    orderid integer NOT NULL,
    orderdate date NOT NULL,
    taxvat numeric(12,2),
    netamount numeric(12,2) NOT NULL,
    totalamount numeric(12,2) NOT NULL,
    employeeid integer NOT NULL,
    customerid integer NOT NULL
);


ALTER TABLE public.orders OWNER TO postgres;

--
-- Name: product; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product (
    id integer NOT NULL,
    name character varying(200) NOT NULL,
    quantity integer NOT NULL,
    importprice numeric(12,2) NOT NULL,
    publishdate date NOT NULL,
    sellprice numeric(12,2) NOT NULL,
    image text,
    tax numeric(12,2),
    status character varying(100),
    description text,
    categoryid integer
);


ALTER TABLE public.product OWNER TO postgres;

--
-- Name: stationary; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.stationary (
    id integer NOT NULL,
    brand character varying(100) NOT NULL,
    type character varying(100)
);


ALTER TABLE public.stationary OWNER TO postgres;

--
-- Name: storestaff; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.storestaff (
    employeeid integer NOT NULL,
    employeename character varying(200) NOT NULL,
    firstname character varying(50),
    lastname character varying(50),
    email character varying(50),
    phone character varying(50),
    gender character varying(10),
    "position" character varying(100) NOT NULL,
    address text,
    startdate date,
    workhour integer,
    managerid integer NOT NULL,
    CONSTRAINT storestaff_gender_check CHECK (((gender)::text = ANY ((ARRAY['Male'::character varying, 'Female'::character varying, 'Other'::character varying])::text[]))),
    CONSTRAINT storestaff_workhour_check CHECK ((workhour >= 0))
);


ALTER TABLE public.storestaff OWNER TO postgres;

--
-- Name: toy; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.toy (
    id integer NOT NULL,
    brand character varying(100) NOT NULL,
    suitableage character varying(50)
);


ALTER TABLE public.toy OWNER TO postgres;

--
-- Data for Name: book; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.book (id, isbn, author, publisher) FROM stdin;
\.


--
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.category (categoryid, categoryname) FROM stdin;
\.


--
-- Data for Name: customer; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.customer (customerid, customername, firstname, lastname, gender, cardnumber, email, phone, address) FROM stdin;
\.


--
-- Data for Name: manager; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.manager (managerid, managername, email, phone, gender) FROM stdin;
\.


--
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.orders (orderid, orderdate, taxvat, netamount, totalamount, employeeid, customerid) FROM stdin;
\.


--
-- Data for Name: product; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.product (id, name, quantity, importprice, publishdate, sellprice, image, tax, status, description, categoryid) FROM stdin;
\.


--
-- Data for Name: stationary; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.stationary (id, brand, type) FROM stdin;
\.


--
-- Data for Name: storestaff; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.storestaff (employeeid, employeename, firstname, lastname, email, phone, gender, "position", address, startdate, workhour, managerid) FROM stdin;
\.


--
-- Data for Name: toy; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.toy (id, brand, suitableage) FROM stdin;
\.


--
-- Name: book book_isbn_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_isbn_key UNIQUE (isbn);


--
-- Name: book book_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (id);


--
-- Name: category category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (categoryid);


--
-- Name: customer customer_cardnumber_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_cardnumber_key UNIQUE (cardnumber);


--
-- Name: customer customer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (customerid);


--
-- Name: manager manager_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.manager
    ADD CONSTRAINT manager_email_key UNIQUE (email);


--
-- Name: manager manager_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.manager
    ADD CONSTRAINT manager_pkey PRIMARY KEY (managerid);


--
-- Name: orders orders_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (orderid);


--
-- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- Name: stationary stationary_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationary
    ADD CONSTRAINT stationary_pkey PRIMARY KEY (id);


--
-- Name: storestaff storestaff_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.storestaff
    ADD CONSTRAINT storestaff_pkey PRIMARY KEY (employeeid);


--
-- Name: toy toy_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.toy
    ADD CONSTRAINT toy_pkey PRIMARY KEY (id);


--
-- Name: book book_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_id_fkey FOREIGN KEY (id) REFERENCES public.product(id) ON DELETE CASCADE;


--
-- Name: orders orders_customerid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_customerid_fkey FOREIGN KEY (customerid) REFERENCES public.customer(customerid);


--
-- Name: orders orders_employeeid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_employeeid_fkey FOREIGN KEY (employeeid) REFERENCES public.storestaff(employeeid);


--
-- Name: product product_categoryid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_categoryid_fkey FOREIGN KEY (categoryid) REFERENCES public.category(categoryid);


--
-- Name: stationary stationary_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stationary
    ADD CONSTRAINT stationary_id_fkey FOREIGN KEY (id) REFERENCES public.product(id) ON DELETE CASCADE;


--
-- Name: storestaff storestaff_managerid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.storestaff
    ADD CONSTRAINT storestaff_managerid_fkey FOREIGN KEY (managerid) REFERENCES public.manager(managerid) ON DELETE CASCADE;


--
-- Name: toy toy_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.toy
    ADD CONSTRAINT toy_id_fkey FOREIGN KEY (id) REFERENCES public.product(id) ON DELETE CASCADE;


--
-- Name: TABLE book; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.book TO adminbook_hust_store;


--
-- Name: TABLE category; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.category TO adminbook_hust_store;


--
-- Name: TABLE customer; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.customer TO adminbook_hust_store;


--
-- Name: TABLE manager; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.manager TO adminbook_hust_store;


--
-- Name: TABLE orders; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.orders TO adminbook_hust_store;


--
-- Name: TABLE product; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.product TO adminbook_hust_store;


--
-- Name: TABLE stationary; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.stationary TO adminbook_hust_store;


--
-- Name: TABLE storestaff; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.storestaff TO adminbook_hust_store;


--
-- Name: TABLE toy; Type: ACL; Schema: public; Owner: postgres
--

GRANT ALL ON TABLE public.toy TO adminbook_hust_store;


--
-- PostgreSQL database dump complete
--

