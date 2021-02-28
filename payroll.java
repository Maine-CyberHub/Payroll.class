// Prompts and validates pay rate and hours, then displays gross pay

 

Module main()

 

        // declare and initialize variables
        Declare Real payRate = promptAndValidatePayrate()
        Declare Integer workHours = promptAndValidateWorkHours()

 

         // calculate the gross pay
        Declare Real grossPay = payRate * workHours

 

        // show calculated pay

        Display "The employee’s gross pay is $", grossPay

 

End Module

 

// prompt, input, and validate pay rate
Function Real promptAndValidatePayrate()

 

        // declare and initialize constants
        Constant Real MIN_RATE = 7.50
        Constant Real MAX_RATE = 18.25
        Constant String PROMPT = "Please enter the employee's hourly pay rate between $",
                        MIN_RATE, " and $", MAX_RATE, ": "

 

        // declare and initialize variables
        Declare Real payRate = 0.0

 

        // priming read

        Display PROMPT
        Input payRate 

 

        // show error message and reprompt until pay rate value is valid
        While payRate < MIN_RATE OR payRate > MAX_RATE
                Display "That rate is invalid, please try again."
                Display PROMPT
                Input payRate 
         End While

 

         Return payRate


End Function

 

// prompt, input, and validate work hours
Function Integer promptAndValidateWorkHours()

 

        // declare and initialize constants
        Constant Integer MIN_HOURS = 0
        Constant Integer MAX_HOURS = 40
        Constant String PROMPT = "Please enter the employee's work hours between ",
                        MIN_HOURS, " and ", MAX_HOURS, ": "

 

        // declare and initialize variables
        Declare Integer workHours = 0

        Display PROMPT
        Input workHours   // priming read

 

        // show error message and reprompt until work hours value is valid
        While workHours < MIN_HOURS OR workHours > MAX_HOURS
                Display "That value is invalid, please try again."
                Display PROMPT
                Input workHours
         End While

 

         Return workHours

 
