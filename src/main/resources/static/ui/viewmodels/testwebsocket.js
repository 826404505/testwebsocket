var app = new Vue({
    el: '#app',
    data: {
    },
    methods: {
        handleConnect() {
            console.log('connect click');
            ws = new WebSocket('ws://localhost:8080/zsq');
            ws.onmessage = function (frame) {
                console.log(frame.data);
            }
        },
        handleSend() {
            console.log('send click');
            ws.send('hhh');
        },
        handleDisconnect(){
            console.log('disconnect click');
            ws.close();
        }
    }
})