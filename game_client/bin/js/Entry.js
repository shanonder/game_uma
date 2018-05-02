var game;
(function (game) {
    var Entry = /** @class */ (function () {
        function Entry() {
            var socket = io('http://localhost:19860');
            socket.on('connect', function () {
                console.log("connect");
            });
            socket.on('event', function (data) { });
            socket.on('disconnect', function () { });
        }
        return Entry;
    }());
    game.Entry = Entry;
})(game || (game = {}));
new game.Entry();
//# sourceMappingURL=Entry.js.map