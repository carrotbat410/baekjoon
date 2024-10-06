package main

import "fmt"

func main() {
	var n, v int

	var arr []int

	fmt.Scan(&n)

	var tmp int
	for i := 0; i < n; i++ {
		fmt.Scan(&tmp)
		arr = append(arr, tmp)
	}
	fmt.Scan(&v)

	solution(arr, v)
}

func solution(arr []int, v int) {
	answer := 0
	for _, num := range arr {
		if num == v {
			answer++
		}
	}
	fmt.Println(answer)
}