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
	for _, t := range arr {
		// fmt.Println("subArr:", subArr)
		fmt.Println(t[0] + t[1])
	}
}