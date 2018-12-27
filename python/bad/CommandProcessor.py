class CommandProcessor:
    @staticmethod
    def process(command):
        print("Starting Command " + command)
        if command=="sing":
            print(command+"ing: We passed upon the stair")
        elif command=="dance":
            print(command+"ing: Gangnam style")
        else:
            print(command+" not supported")
        print("Ending Command " + command)
