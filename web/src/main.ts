import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";

import Antd from "ant-design-vue";
import "ant-design-vue/dist/reset.css";
import * as Icons from '@ant-design/icons-vue';
import axios from "axios";

axios.defaults.baseURL = process.env.NODE_APP_SERVER;

axios.interceptors.request.use((config) => {
    console.log(config);
    return config;
}, error => {
    return Promise.reject(error);
})

axios.interceptors.response.use((response) => {
    console.log(response);
    return response;
}, error => {
    return Promise.reject(error);
})

const icons: any = Icons;
const app = createApp(App);

app.use(Antd).use(router).mount("#app");

for (const i in icons) {
    app.component(i, icons[i])
}

