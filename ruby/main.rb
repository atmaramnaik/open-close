load 'Bad.rb'
load 'Good.rb'
puts "Enter command:"
command=gets.chomp
# Bad::CommandProcessor.process(command)
Good::CommandProcessor.commands.push(Good::Command.new("sing", ->(action) {puts action+"ing: We passed upon the stair"}))
Good::CommandProcessor.commands.push(Good::Command.new("dance", ->(action) {puts action+"ing: Gangnam style"}))
Good::CommandProcessor.commands.push(Good::Command.new("play", ->(action) {puts action+"ing: Chess"}))
Good::CommandProcessor.process(command)
