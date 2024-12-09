
![Alt text](images/working-with-context-variables-node.png)

#Context Variable Demo


##Background
A simple application that demonstrates how to bind a variable to a context.



##Running the application



The above command will launch the server

```
npm run start
```

And this command will allow you to test via the command line

```
clear && curl -v 'http://localhost:3000/welcome'
```
This will produce a series of logs that essentially just illustrates the shared unique transaction id across the various actors in the call stack.


You can find more details on my personal blog [https://www.matthewdalby.dev]()