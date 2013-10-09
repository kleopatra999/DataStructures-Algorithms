1+2=3

object[] obj = {o1, o2, o3, o4, o5};

int[] indices = {1, 3, 4, 2, 0} ;

object[] obj = {o5, o1, o4, o2, o3};

swap(currenetindex->o1 ,  indices[o1]);

//hashmap for every object in obj array  
//hashmap(key, value) key(object)->value(desiredLocation)
//read hahmap and overwrite values in obj

for(int i=0; i < obj.length; i++) {
        swap(obj[i], obj[indices[i]]);
}

swap(obja, objb){
    obj temp;
    temp = obja;
    obja=objb;
    objb=temp;
}

0    1   2   3  4
o2, o1, o3, o4, o5

02->3
o3, o1, o4, o2, o5

03->4

o5 o1 o4 o2 o3

o4->2

--

05-->0

--






