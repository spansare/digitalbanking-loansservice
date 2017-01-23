INSERT INTO "branch" ("branch_id", "branch_name", "ifsc_code", "branch_city", "assets") VALUES
(1,	'SBI Main Branch',	'capg123',	'Pune',	1000);

INSERT INTO "branch" ("branch_id", "branch_name", "ifsc_code", "branch_city", "assets") VALUES
(2,	'HDFC Main Branch',	'hdfc123',	'Pune',	2000);

insert into loanmaster ("loan_id", "loan_name", "loan_type") VALUES (1, 'Home Loan', 'HL');
insert into loanmaster ("loan_id", "loan_name", "loan_type") VALUES (2, 'Auto Loan', 'AL');
insert into loanmaster ("loan_id", "loan_name", "loan_type") VALUES (3, 'PL Loan', 'PL');

insert into customer ("customer_id", "customer_name", "address", "city", "mobile_no", "email_id")
 VALUES (1, 'Pankaj', 'Talwade', 'Pune', 8796, 'a@a.com');
 
 insert into customer ("customer_id", "customer_name", "address", "city", "mobile_no", "email_id")
 VALUES (2, 'Raj', 'Bandra', 'Mumbai', 86336, 'b@b.com');
	 
	 
insert into loan ("loan_account_id", "branch_id", "loan_account_number", "amount", "loan_type", "customer_id", "loan_id","duration","rate_of_interest",
"loan_status","loan_commencement_date","loan_creation_date","loan_emi_date")
 VALUES (1, 1, 'HL-123', '30000','HL', 1, 1,240,9.0,'Open','2016-03-21 09:10:59.897666','2016-04-21 09:10:59.897666','2016-05-21 09:10:59.897666');
 
 insert into loan ("loan_account_id", "branch_id", "loan_account_number", "amount", "loan_type", "customer_id", "loan_id","duration","rate_of_interest","loan_status",
 "loan_commencement_date","loan_creation_date","loan_emi_date")
 VALUES (2, 1, 'AL-153', '20000','AL', 2, 1,84,9.75,'Open','2016-03-21 09:10:59.897666','2016-04-21 09:10:59.897666','2016-05-21 09:10:59.897666');
 
 insert into loan ("loan_account_id", "branch_id", "loan_account_number", "amount", "loan_type", "customer_id", "loan_id","duration","rate_of_interest",
 "loan_status","loan_commencement_date","loan_creation_date","loan_emi_date")
 VALUES (3, 1, 'PL-154', '50000','PL', 1, 1,60,11.49,'Open','2016-03-21 09:10:59.897666','2016-04-21 09:10:59.897666','2016-05-21 09:10:59.897666');
 
 insert into loan ("loan_account_id", "branch_id", "loan_account_number", "amount", "loan_type", "customer_id", "loan_id","duration","rate_of_interest",
 "loan_status","loan_commencement_date","loan_creation_date","loan_emi_date")
 VALUES (4, 1, 'AL-153', '20000','AL', 2, 1,84,9.75,'Open','2016-03-21 09:10:59.897666','2016-04-21 09:10:59.897666','2016-05-21 09:10:59.897666');