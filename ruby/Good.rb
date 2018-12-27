module Good
  class CommandProcessor
    @@commands=Array.new
    def self.commands
      @@commands
    end
    def CommandProcessor.process(command)
      puts "Executing "+command
      @@commands.each do |oCommand|
        if oCommand.command==command
          oCommand.action.call(command)
        end
      end
      puts "Done Executing "+command
    end
  end
  class Command
    attr_reader :command
    attr_reader :action
    def initialize(command,action)
      @command = command
      @action = action
    end
  end
end