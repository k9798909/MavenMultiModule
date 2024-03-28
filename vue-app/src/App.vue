<script setup lang="ts">
import { ref } from 'vue'
import { RouterView } from 'vue-router'
import Sidebar from './components/Sidebar.vue'

const drawer = ref(true)
</script>

<template>
  <v-layout>
    <v-app-bar class="header bg-grey-lighten-5" :elevation="2">
      <template v-slot:prepend>
        <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      </template>
      <v-app-bar-title>Application Bar</v-app-bar-title>
    </v-app-bar>

    <Sidebar :drawer="drawer" />

    <v-main class="main">
      <RouterView />
    </v-main>
  </v-layout>
</template>

<style scoped>
.main {
  min-height: 100vh;
}
</style>
