CC=g++

all: main.o student.o
	$(CC) -o main.bin main.o student.o

main.o:	main.c student.h
	$(CC) -c main.c

student.o: student.c student.h
	$(CC) -c student.c

clean:
	rm main.bin main.o student.o
