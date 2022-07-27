#Ebay Japan 
-- --
##1.
> input
> * 기준 날짜 (int)
> * 기준 요일 (String)
> * 목표 날짜 (int)

> output
> * 목표 요일 (String)
-- --
##2.
* Gold 회원
* Silver 회원
* Bronze 회원

> input
> * 승격 조건[금액,입출금 횟수] (int [][])
> * 고객 인풋[입출금 내역] (int[]) 

> output
> * 고객의 현재 등급 (String)
> * 고객의 다음 등급 (String)
> * 승격까지 남은 금액 과 횟수 (int[])
-- --
##3.
지하철 노선도가 주어진다.
각 지하철 노선 ID 별, 가장 마지막 순번의 정거장 ID를 구하라
> Schema
> 
> | 노선 ID | 노선 이름 | From 정거장 Id | To 정거장 Id | 순번

> Source Data
> 
> 1 / yellow / 1 / 2  / 1
> 
> 1 / yellow / 2 / 3  / 2
> 
> 2 / green  / 3 / 7  / 1
> 
> 2 / green  / 7 / 10 / 2
> 
> 3 / black / 2 / 7   / 1
> 
> 3 / black / 7 / 12  / 2

> sql output
> 
> yellow / 3
> 
> green  / 10
> 
> black  / 12
-- --