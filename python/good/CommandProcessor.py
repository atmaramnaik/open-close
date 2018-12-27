class CommandProcessor:
    commands=[]
    @staticmethod
    def process(command):
        print("Starting Command " + command)
        for oCommand in CommandProcessor.commands:
            if oCommand.verb == command:
                oCommand.action(command)

        print("Ending Command " + command)
class Command:
    def __init__(self, verb, action):
        self.verb = verb
        self.action = action