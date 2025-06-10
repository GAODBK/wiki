import { createRouter, createWebHistory, RouteRecordRaw } from "vue-router";
import home from "../views/HomeView.vue";
import about from "../views/AboutView.vue";

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    name: "home",
    component: home,
  },
  {
    path: "/about",
    name: "about",
    component: about
  },
  {
    path: "/admin/ebook",
    name: "ebook",
    component: import("../views/admin/EbookAdmin.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
