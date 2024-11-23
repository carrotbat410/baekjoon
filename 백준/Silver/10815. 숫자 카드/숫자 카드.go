package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	var n int
	var m int

	sH := map[int]int{}
	cardSlice := []int{}

	fmt.Fscanln(reader, &n) // 한 줄 입력, 띄어쓰기로 구분 ex) 1 2 => a=1, b=2

	line, _ := reader.ReadString('\n')
	for _, val := range strings.Fields(line) {
		card, _ := strconv.Atoi(val)
		sH[card] = 1
	}

	fmt.Fscanln(reader, &m)

	line, _ = reader.ReadString('\n')
	for _, val := range strings.Fields(line) {
		num, _ := strconv.Atoi(val)
		cardSlice = append(cardSlice, num)
	}

	for _, v := range cardSlice {
		_, ok := sH[v]
		if ok {
			fmt.Fprintf(writer, "%s ", "1")
			// fmt.Println(1, " ")
		} else {
			// fmt.Println(0, " ")
			fmt.Fprintf(writer, "%s ", "0")
		}
	}
}