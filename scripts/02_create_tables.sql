create table public.loanmaster
   (
    loan_id integer NOT NULL,
    loan_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    loan_type character varying(3) COLLATE pg_catalog."default" NOT NULL,
    PRIMARY KEY(loan_id)
    )
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

create table public.branch
   (
     branch_id     integer NOT NULL,
     branch_name   character varying(30) COLLATE pg_catalog."default" NOT NULL,
     ifsc_code character varying(30) COLLATE pg_catalog."default" NOT NULL,
     branch_city   character varying(20) COLLATE pg_catalog."default" NOT NULL,
     assets       double precision NOT NULL,
     PRIMARY KEY (branch_id)
     --CONSTRAINT pk_branchid PRIMARY KEY (branchid)
     )
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;
--DROP TABLE public.loan;

CREATE TABLE public.customer
(
    customer_id integer NOT NULL,
    customer_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    address character varying(20) COLLATE pg_catalog."default",
    city character varying(20) COLLATE pg_catalog."default",
    mobile_no integer,
    email_id character varying(50) COLLATE pg_catalog."default",
    PRIMARY KEY (customer_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer
    OWNER to postgres;

CREATE TABLE public.loan
(
   loan_account_id integer NOT NULL,
   branch_id	integer NOT NULL,
   loan_account_number character varying(20) COLLATE pg_catalog."default" NOT NULL,
   amount double precision NOT NULL,
   loan_type character varying(3) COLLATE pg_catalog."default" NOT NULL,
   customer_id integer NOT NULL,
   loan_id integer NOT NULL,
   duration integer NOT NULL,
   rate_of_interest double precision NOT NULL,
   loan_status character varying(10) COLLATE pg_catalog."default" NOT NULL,
   loan_commencement_date timestamp,
   loan_creation_date timestamp,
   loan_emi_date timestamp,
   PRIMARY KEY (loan_account_id),
   CONSTRAINT branch_branchid_fkey FOREIGN KEY (branch_id)
   REFERENCES public.branch (branch_id) MATCH SIMPLE,
   CONSTRAINT loan_loanid_fkey FOREIGN KEY (loan_id)
   REFERENCES public.loanmaster (loan_id) MATCH SIMPLE,
   CONSTRAINT customer_customerid_fkey FOREIGN KEY (customer_id)
   REFERENCES public.customer (customer_id) MATCH SIMPLE
   ON UPDATE NO ACTION
   ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.loan
    OWNER to postgres;
	
CREATE TABLE public.Borrower
(
	customer_id integer NOT NULL,
    loan_account_id integer NOT NULL,
    PRIMARY KEY ( customer_id, loan_account_id ),
  	CONSTRAINT customer_customerId_fkey FOREIGN KEY (customer_id)
    REFERENCES public.Customer (customer_id) MATCH SIMPLE,
    CONSTRAINT loan_loanAccountId_fkey FOREIGN KEY (loan_account_id)
    REFERENCES public.Loan (loan_account_id) MATCH SIMPLE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.loan
    OWNER to postgres;

