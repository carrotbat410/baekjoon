package main

import "fmt"

func main() {
	var n, sum int

	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		sum += i
	}
	fmt.Println(sum)

	//for문 안돌고 공식이용해 구하는게 더 좋다.
}