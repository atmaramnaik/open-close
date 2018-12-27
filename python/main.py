import bad.CommandProcessor as BCP
import good.CommandProcessor as GCP
command = input("What Do you want me to Do: ")
BCP.CommandProcessor.process(command)

def sing(action):
    print(action+"ing: We passed upon the stair")
GCP.CommandProcessor.commands.append(GCP.Command("sing", sing))
GCP.CommandProcessor.commands.append(GCP.Command("dance", lambda action: print(action+"ing: Gangnam style")))
GCP.CommandProcessor.commands.append(GCP.Command("play", lambda action: print(action+"ing: Chess")))
GCP.CommandProcessor.process(command)
