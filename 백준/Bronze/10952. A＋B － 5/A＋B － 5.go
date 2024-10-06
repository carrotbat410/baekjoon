package main

import "fmt"

func main() {
	var a, b int

	var arr [][]int

	for {
		fmt.Scan(&a, &b)
		if a == 0 && b == 0 {
			break
		}
		arr = append(arr, []int{a, b})
	}
	solution(arr)
}

func solution(arr [][]int) {
	for _, subArr := range arr {
		fmt.Println(subArr[0] + subArr[1])
	}
}
