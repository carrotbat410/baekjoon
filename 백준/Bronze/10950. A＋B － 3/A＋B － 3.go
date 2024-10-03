package main

import "fmt"

func main() {
	var n, temp1, temp2 int
	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		fmt.Scan(&temp1, &temp2)
		fmt.Println(temp1 + temp2)
	}
}