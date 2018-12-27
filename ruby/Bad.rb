module Bad
  class CommandProcessor
    def CommandProcessor.process(command)
      puts "Executing "+command
      case command
      when "sing"
        puts command+"ing: We passed upon the stair"
      when "dance"
        puts command+"ing: Gangnam style"
      end
      puts "Done Executing "+command
    end
  end
end