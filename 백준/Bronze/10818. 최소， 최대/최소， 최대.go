package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	nStr, _ := reader.ReadString('\n')
	n, _ := strconv.Atoi(strings.TrimSpace(nStr))

	numsStr, _ := reader.ReadString('\n')
	numsStrSlice := strings.Fields(numsStr)

	// 초기값 설정
	min, _ := strconv.Atoi(numsStrSlice[0])
	max := min

	// 숫자들을 순회하면서 최솟값과 최댓값 찾기
	for i := 1; i < n; i++ {
		num, _ := strconv.Atoi(numsStrSlice[i])
		if num < min {
			min = num
		}
		if num > max {
			max = num
		}
	}

	// 결과 출력
	fmt.Printf("%d %d\n", min, max)
}
