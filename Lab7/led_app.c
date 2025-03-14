#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LED_PATH "/sys/class/leds/led0/"

// Function to control the LED state
void controlLed(int state) {
	FILE *file = fopen(LED_PATH "brightness", "w");
	if (file == NULL) {
		perror("Error opening brightness file");
		exit(EXIT_FAILURE);
	}
	
	fprintf(file, "%d", state);
	
	fclose(file);
}

int main() {
    // Turn on the LED
    printf("Turning on the LED...\n");
    controlLed(1);

    sleep(2);

    // Turn off the LED
    printf("Turning off the LED...\n");
    controlLed(0);

    return 0;
}
