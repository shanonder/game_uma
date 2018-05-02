
namespace game{
    export class Entry{
        constructor(){
            let socket:SocketIOClient.Socket = io('http://localhost:19860');
            socket.on('connect', function(){
                console.log("connect");
            });
            socket.on('event', function(data){});
            socket.on('disconnect', function(){});
        }
    }
}

new game.Entry();