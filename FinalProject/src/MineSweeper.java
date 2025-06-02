import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    char[][] mineBoard;     // Gerçek veriler: mayınlar ve sayılar
    char[][] displayBoard;  // Kullanıcıya gösterilen tahta

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

        initializeBoard();
        placeMines();
        calculateAdjacentMines();
    }

    public void initializeBoard() {
        mineBoard = new char[rowNumber][colNumber];
        displayBoard = new char[rowNumber][colNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineBoard[i][j] = '-';
                displayBoard[i][j] = '-';
            }
        }
    }

    public void placeMines() {
        int totalMines = (rowNumber * colNumber) / 4;
        int placedMines = 0;

        while (placedMines < totalMines) {
            int randRow = (int) (Math.random() * rowNumber);
            int randCol = (int) (Math.random() * colNumber);

            if (mineBoard[randRow][randCol] != '*') {
                mineBoard[randRow][randCol] = '*';
                placedMines++;
            }
        }
    }

    public void calculateAdjacentMines() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (mineBoard[i][j] == '*') {
                    continue;
                }

                int count = 0;

                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        int ni = i + x;
                        int nj = j + y;

                        if (ni >= 0 && ni < rowNumber && nj >= 0 && nj < colNumber) {
                            if (mineBoard[ni][nj] == '*') {
                                count++;
                            }
                        }
                    }
                }

                mineBoard[i][j] = (char) (count + '0');
            }
        }
    }

    public void printDisplayBoard() {
        System.out.println("\nTahta:");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(displayBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void revealMines() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (mineBoard[i][j] == '*') {
                    displayBoard[i][j] = '*';
                }
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int totalCells = rowNumber * colNumber;
        int totalMines = totalCells / 4;
        int safeCellsToOpen = totalCells - totalMines;
        int openedCells = 0;

        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");

        while (true) {
            printDisplayBoard();
            System.out.print("Satır girin (0-" + (rowNumber - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Sütun girin (0-" + (colNumber - 1) + "): ");
            int col = scanner.nextInt();

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat. Tekrar deneyin.");
                continue;
            }

            if (mineBoard[row][col] == '*') {
                System.out.println("\n💥 Mayına bastınız! Oyun bitti!");
                revealMines();
                printDisplayBoard();
                break;
            } else if (displayBoard[row][col] != '-') {
                System.out.println("Bu hücre zaten açıldı.");
            } else {
                displayBoard[row][col] = mineBoard[row][col];
                openedCells++;

                if (openedCells == safeCellsToOpen) {
                    System.out.println("\n🎉 Tebrikler! Tüm güvenli hücreleri açtınız. Kazandınız!");
                    revealMines();
                    printDisplayBoard();
                    break;
                }
            }
        }
    }
}
