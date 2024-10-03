package main

import "fmt"

func main() {
	var n, a, b int

	fmt.Scan(&n)

	var arr [][]int

	for i := 0; i < n; i++ {
		fmt.Scan(&a, &b)
		arr = append(arr, []int{a, b})
	}
	solution(arr)
}

func solution(arr [][]int) {
	for i, subArr := range arr {
		fmt.Printf("Case #%d: %d\n", i+1, subArr[0]+subArr[1])
	}
}