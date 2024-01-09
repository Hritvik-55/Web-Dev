import './App.css'

const title='React++';

function getTitle(title){
  return title;
}
const grretings=['Hey','Hi',"Hello","Hola"];

function App() {
 

  return (

    <>
      <div>
        <h1>{grretings} {getTitle('React')}</h1>
        <h2>{title}</h2>
        <label htmlFor="search">Search: </label>
        <input type="text" name="search" id="s1" />
        </div>
        </>
  );
}

export default App
