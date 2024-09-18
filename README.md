# Mines Clone

This is a Minesweeper-inspired Java GUI game with a simple grid interface. Some of the buttons in the grid hide mines, while others hide diamonds. Clicking on the buttons reveals either a mine or a diamond, along with some custom visuals for each.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Classes Overview](#classes-overview)
  - [CustomRoundedButtonUI](#customroundedbuttonui)
  - [Diamonds](#diamonds)
  - [Mines](#mines)
  - [MineInputDialog](#mineinputdialog)
  - [MinesGUI](#minesgui)
- [Customization](#customization)

## Installation

1. Clone the repository or download the source files.
2. Ensure you have a Java Development Kit (JDK) installed.
3. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
4. Run the `MinesGUI.java` file to launch the game.

## Usage

The game consists of a 5x5 grid of buttons. Some buttons hide mines, while others hide diamonds. Clicking a button will reveal either a diamond or a mine image, which is resized to fit the button.

- **Mines** are represented by a different image and may have distinct effects in the game.
- **Diamonds** are also represented by an image, and they behave differently from mines.

### Mines Count

You can specify the number of mines by using the `MineInputDialog`. If an invalid number is provided or the user cancels, the default number of mines (10) will be used.

## Classes Overview

### `CustomRoundedButtonUI`
This class is a custom UI implementation for rounded buttons. It provides:
- Rounded corners for buttons.
- Custom rendering for button backgrounds, borders, and text.

### `Diamonds`
The `Diamonds` class handles the behavior of a button that hides a diamond image. When clicked:
- The diamond image is loaded and scaled to fit the button.
- The button's background changes to a dark blue.

### `Mines`
The `Mines` class is responsible for buttons that hide a mine image. When clicked:
- The mine image is loaded and scaled to fit the button.
- The button's background changes to a dark blue.

### `MineInputDialog`
This class is a simple dialog that asks the user to input the number of mines. It:
- Validates the user's input.
- Provides a default value if the input is invalid or canceled.

### `MinesGUI`
This is the main class for the game, responsible for:
- Setting up the 5x5 grid of buttons.
- Randomly assigning three buttons as "mines" and the rest as "diamonds."
- Setting the button properties and action listeners.

## Customization

- You can change the grid size by modifying the `GRID_SIZE` variable in the `MinesGUI` class.
- Modify the images for mines and diamonds by changing the file paths in the `Diamonds` and `Mines` classes.
- Adjust the padding around the images by changing the `IMAGE_PADDING` and `MINE_PADDING` constants.
