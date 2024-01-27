async function getSongs() {
  let a = await fetch("http://127.0.0.1:3000/Spotify%20Clone/songs/");
  let response = await a.text();
  let div = document.createElement("div");
  div.innerHTML = response;
  let as = div.getElementsByTagName("a");
  let songs = [];
  for (let i = 0; i < as.length; i++) {
    const element = as[i];
    if (element.href.endsWith(".mp3")) {
      songs.push(element.href.split("/songs/")[1]);
    }
  }
  return songs;
}
async function main() {
  let songs = await getSongs();
  console.log(songs);
  let songUL = document
    .querySelector(".songList")
    .getElementsByTagName("ul")[0];
  for (const song of songs) {
    songUL.innerHTML =
      songUL.innerHTML +
      `
        <li>
                        <img class="invert" src="music.svg" alt="">
                        <div class="info">
                            <div>${song.replaceAll("%20"," ")}</div>
                            <div>Hritvik</div>
                        </div>
                        <div class="playnow">
                            <span>Play Now</span>
                        <img src="play.svg" class="invert" alt="">

                    </div>
                       </li>
        
        `;
  }
 
 
}

main();
