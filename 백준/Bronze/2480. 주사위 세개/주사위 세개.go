package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b, c int

	fmt.Scan(&a, &b, &c)

	var sameNum int
	var sameCnt int

	if a == b {
		findSameNum(&sameNum, &sameCnt, a)
	}
	if b == c {
		findSameNum(&sameNum, &sameCnt, b)
	}
	if c == a {
		findSameNum(&sameNum, &sameCnt, c)
	}

	if sameCnt != 0 && sameCnt < 3 {
		sameCnt++
	}

	max := math.Max(float64(a), float64(b))
	max = math.Max(max, float64(c))

	if sameCnt == 3 {
		fmt.Println(10000 + (1000 * sameNum))
	} else if sameCnt == 2 {
		fmt.Println(1000 + (sameNum * 100))
	} else {
		fmt.Println(max * 100)
	}
}

func findSameNum(sameNum *int, sameCnt *int, value int) {
	*sameNum = value
	*sameCnt++
}
