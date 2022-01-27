
-- 1 EMPLOYEES 테이블의 레코드 중 사원번호 , 사원명, 입사일, 성별을 선택
select emp_no, first_name, hire_date, gender from employees;

-- 2 EMPLOYEES 테이블의 레코드 중 사원번호, 사원명, 입사일을 선택 (사원명 오름차순 정렬)
select emp_no, first_name, hire_date from employees order by first_name asc;

-- 3 EMPLOYEES 테이블의 레코드 중 6월, 12월에 입사한 사원의 사원번호, 사원명, 입사일을 선택
select emp_no, first_name, hire_date from employees where hire_date like '_____06%' || hire_date like '_____12%';

-- 4 EMPLOYEES 테이블의 레코드 중 사원명에 'A'로 시작하고 생일이 1950~1959년 사이인 사원을 나이가 많은 순으로 선택
select * from employees where first_name like 'A%' and birth_date like '195%' order by birth_date asc;

select * from employees where first_name like 'A%' and birth_date between 
'1950-01-01' and '1959-12-31' order by birth_date asc;

-- 5 EMPLOYEES 테이블의 레코드 중 1960년도에 태어난 남자사원을 선택
select * from employees where birth_date like '1960%' and gender = 'm';

-- 6 EMPLOYEES 테이블의 사원 중 1월에 태어난 여자 사원을 이름을 오름차순으로 선택
select * from employees where birth_date like '_____01%' and gender = 'f' order by first_name asc;

-- 7  EMP테이블의 사원 입사일이 1990-01-01 이후인 사원과 이름에 B가 포함된 사원을 입사일 기준 내림차순으로 정렬하여 선택
select * from employees where hire_date >='1990-01-01' or first_name like '%b%' order by hire_date desc; 

-- 8 현재 데이터베이스의 테이블 목록을 확인하는 쿼리문을 작성
show tables;

-- 9 EMPLOYEES테이블의 사원 중 사원번호, 이름, 생년월일, 입사일을 이름은 오름차순, 사원번호는 내림차순으로 정렬하여 선택
select emp_no, first_name, birth_date, hire_date from employees order by first_name asc, emp_no desc;

-- 10 EMPLOYEES테이블의 구조를 확인하는 쿼리문을 작성
desc employees;

-- 11  현재 계정의 데이터베이스의 목록을 확인하는 쿼리문을 작성
show databases;








  