// Here is a bunch of Lorem Ipsum. You will need it. I recomend using word wrap to view this! View > Toggle Word Wrap
const lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi dictum lorem vel elit laoreet, vitae maximus ligula consectetur. Etiam magna quam, varius at risus eu, rutrum commodo lacus. Maecenas felis sem, consequat non congue non, vestibulum vitae orci. Etiam laoreet ultricies enim, sit amet gravida massa sodales vel. Vivamus tempus neque sed mi elementum ornare eget non lorem. Donec dapibus ex tortor, ut vehicula metus scelerisque eget. Aenean dictum iaculis nulla, vel dapibus justo dignissim quis. Curabitur vitae efficitur neque. Ut vitae orci semper, efficitur dolor eget, porta dui. Cras eu sapien aliquam mauris facilisis ullamcorper. Nullam facilisis sem diam, quis tempor felis interdum ut. Praesent eu nibh arcu. Proin a quam augue. Integer malesuada finibus sem eget consectetur. Aenean non hendrerit purus, quis auctor elit. Duis ullamcorper, ex vitae rutrum ullamcorper, diam justo maximus quam, eget pellentesque metus nunc sit amet arcu. Nunc id eros leo. Praesent ultricies, nunc sit amet finibus posuere, quam magna viverra lectus, non tincidunt tellus mauris sit amet turpis. Nam eleifend quam vel justo pulvinar euismod. Duis ac elit id risus ultricies sollicitudin vitae ac quam. Donec et cursus leo, non dignissim enim. Vestibulum in felis imperdiet, venenatis tortor iaculis, congue augue. Nullam egestas dui nec quam sagittis sollicitudin ac blandit turpis. Nunc in fermentum odio. Morbi sodales mi nibh, ac cursus felis ultricies sed. Quisque at porttitor risus. Aenean a massa in libero venenatis tempus sed in mi. Nullam luctus sapien eget sagittis egestas. Pellentesque eros sem, semper eu molestie in, commodo a lacus. Phasellus pellentesque erat magna, eu facilisis nibh porttitor eget. Ut id mi lobortis, consequat orci ac, vulputate metus. Sed vulputate turpis nec lectus malesuada lacinia. Quisque non mattis eros. Aliquam pellentesque urna vulputate, auctor nibh in, fermentum odio. Suspendisse aliquam neque et aliquam facilisis. Donec sapien felis, molestie vel vestibulum non, sagittis sed felis. Aenean sodales iaculis dolor eget malesuada. Fusce ac libero hendrerit, viverra nunc iaculis, maximus nisi. Nulla volutpat nisi purus, non interdum erat hendrerit vitae. Integer viverra dignissim cursus. Phasellus eu libero sed ex faucibus convallis. In et egestas ipsum. Cras a metus mollis, laoreet risus eget, ultrices purus. Duis at ligula venenatis, imperdiet nulla et, bibendum augue. Pellentesque eleifend libero maximus, pretium lectus et, condimentum metus. Nulla vel est diam. In fermentum ut nulla eget finibus. Aliquam at turpis sagittis, feugiat diam ac, pulvinar quam. Phasellus pretium porta aliquet. Nunc sit amet nisl viverra justo porttitor egestas vel vitae eros. Fusce sit amet fringilla sapien. Nunc placerat, est sit amet laoreet pretium, augue turpis lacinia ipsum, non luctus magna ipsum vel sapien. Fusce luctus odio eget nunc rutrum ullamcorper. Integer vel ligula id elit viverra aliquam. Praesent id ultricies neque. Quisque molestie tellus ac ex vulputate rhoncus. Donec nec massa eget augue tincidunt ultrices vitae at diam. Ut risus purus, egestas eu eros sed, egestas auctor erat. Integer vulputate erat nisi, in aliquet turpis faucibus vel. Praesent neque augue, congue at nunc ut, congue ultricies erat. Ut sed erat in dui ornare malesuada. Nam id elementum ex. Vestibulum condimentum erat quis erat molestie hendrerit. Etiam laoreet volutpat quam, eget ornare ex molestie mollis. Phasellus eros mi, ultrices vel dui ac, facilisis consectetur nunc. Aliquam erat volutpat. Donec rutrum laoreet iaculis."

// Add a list of colors to this array
const colors = ["Blue", "Green","Gray","Purple","Red","Pink","Orange","White","Yellow","Black"]


// Use this object for your random name generator. Enter in a bunch of objects with first and last names. When generating a new random name, try to grab a random first or last name from any object. Don't just take object as a whole.
const names =
[
    {
        firstName: "Prashant",
        lastName: "Veer"
    },
    {
        firstName: "Suraj",
        lastName: "Bagade"
    },
    {
        firstName: "Boby",
        lastName: "Smith"
    },
    {
        firstName: "Boby",
        lastName: "john"
    },
    {
        firstName: "Bhushan",
        lastName: "sawant"
    },
    {
        firstName: "Sandip",
        lastName: "john"
    }
]




//first random Function
let randomGenerator=(min,max)=>{
    let rand=Math.floor(Math.random()*(max-min+1)+min)
    console.log(rand)
    return rand 
}
// Return a random number between 1-100
const randomOneToHundred=()=>{
    let newRand=randomGenerator(1,100)

    document.getElementById("p1").innerHTML=newRand
}

// Return random number between "Start" and "End"

const randStartAndEnd=(start,end)=>{
    let startVal=document.getElementById("randStart").value
    let endVal=document.getElementById("randEnd").value

    let newRandVal=randomGenerator(startVal,endVal)
    document.getElementById("p2").innerHTML=newRandVal
}

// Returns a long Lorem ipsum String

const loremString=()=>{
    document.getElementById("p3").innerHTML=lorem
}


// Returns a Lorem Ipsum String Based on number of sentences specified
const loremSentences=()=>{
    let numberOfSentences=document.getElementById("loremSentences").value

    //split array containing the sentences
    let newLoremSentence=lorem.split(".")

    let newLorem=""
    for(let i=0; i<numberOfSentences; i++)
    {
        newLorem=newLorem+newLoremSentence[i]+" . "
    }
    console.log(`${newLorem}`)
    document.getElementById("p4").innerHTML=`${newLorem}`
}

// Returns a Lorem Ipsum String based on the number of characters specified
const loremChars=()=>{
    let numberOfSentences=document.getElementById("loremchar").value

    //split array containing the sentences
    let newLoremCharacters=lorem.split("")

    let newLorem=""
    for(let i=0; i<numberOfSentences; i++)
    {
        newLorem=newLorem+newLoremCharacters[i]
    }
    console.log(`${newLorem}`)
    document.getElementById("p5").innerHTML=`${newLorem}`
}

// Returns the current date(Formatted)

const newDate=()=>{
    let myDate=new Date()
    let year=myDate.getFullYear()
    let month=myDate.getMonth()+1
    if(month<=9){
       month= `0${month}`
    }
    else{
      month=  month
    }
    
    let day=myDate.getDate()

    let myNewDate=`${month}-${day}-${year} `

    document.getElementById("p6").innerHTML=myNewDate
}



//  Returns the current time(Formatted)

const newTime=()=>{
    let myTime=new Date()

    let hours=myTime.getHours()
    let minutes=myTime.getMinutes()
    let seconds=myTime.getSeconds()

    let ampm
    

    if(hours>=12)
    {
        ampm="PM"
    }
    else{
        ampm="AM"
    }

    if(hours>12)
    {
        hours=hours-12
    }
     if(hours<10)
   {  
    hours=  `0${hours}`
   }
    if(minutes<10){
        minutes=`0${minutes}`
    }
    if(seconds<10)
    {
        seconds=`0${seconds}`
    }

    let myNewTime=`${hours}:${minutes}:${seconds} ${ampm}`

    document.getElementById("p7").innerHTML=myNewTime
}


        // Convert Inches to Feet

const convertInchesToFeet=()=>{
    let inches=document.getElementById("inches").value
    let convertedFeet=`${inches/12}  FT`
    document.getElementById("p8").innerHTML=convertedFeet
    }
    
    // Convert Feet to Inches

const convertFeetToInches=()=>{
    let feet=document.getElementById("feet").value
    let convertedInch=`${feet*12}  Inches`
    document.getElementById("p9").innerHTML=convertedInch
    }

    //Compares if two words are the same length

    const compareWords=()=>
    {
        let word1=document.getElementById("firstword").value
        let word2=document.getElementById("secondword").value
        let msg=""
        if(word1.length==word2.length)
        {
            msg=`Both words are the same Length`
        }
        else{
            msg=`Word lengths are different . ${word1} :  ${word1.length}  ${word2} : ${word2.length}`
        }
        document.getElementById("p10").innerHTML=msg
    }

    // Return a random Password

    const passwordGen=()=>{
        let char=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","!","@","#"]


        let newPass=""
        for (let i=0; i<=12; i++) {
            let num=randomGenerator(0, (char.length-1))
            newPass=`${newPass}${char[num]}`
            
        }
        document.getElementById("p11").innerHTML=newPass
    }


    //Tells you if the number is even or odd
    const evenOdd=()=>{
        let newNum=document.getElementById("num").value
        let newMsg=""

        if(newNum%2==0){
            newMsg=`${newNum} is even`
        }
        else{
            newMsg=`${newNum} is odd`
        }

        document.getElementById("p12").innerHTML=newMsg
    }


// Returns a random color


const randcolor=()=>{
    let newcolor=colors[randomGenerator(0,(colors.length-1))]

    document.getElementById("p13").innerHTML=`${newcolor}`
    document.getElementById("p13").style.color=`${newcolor}`   }



    // Rerurns a random first and last name
   const randName=()=>{
        let first=names[randomGenerator(0,(names.length-1))].firstName
        let last=names[randomGenerator(0,(names.length-1))].lastName
        let newName=`${first} ${last}`
        document.getElementById("p14").innerHTML=newName
    }