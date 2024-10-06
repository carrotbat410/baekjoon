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

	answerI := -1
	answerNum := -1
	for i := 0; i < 9; i++ {
		nStr, _ := reader.ReadString('\n')
		n, _ := strconv.Atoi(strings.TrimSpace(nStr))

		if n > answerNum {
			answerI = i + 1
			answerNum = n
		}
	}
	fmt.Println(answerNum)
	fmt.Println(answerI)
}