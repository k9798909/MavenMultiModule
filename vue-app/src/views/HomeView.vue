<script setup lang="ts"></script>

<template>
  <div class="d-flex justify-center align-center flex-column h-100">
    <section class="text-center">
      <h1 class="tagline">The <span class="accent">Progressive</span><br />JavaScript Framework</h1>
      <p class="description">
        An approachable, performant and versatile framework for building web user interfaces.
      </p>
    </section>
    <div>
      <v-icon class="mx-5" color="primary" icon="mdi-language-typescript" size="x-large" />
      <v-icon class="mx-5" icon="mdi-github" size="x-large" />
      <v-icon class="mx-5" color="green-darken-2" icon="mdi-vuejs" size="x-large" />
      <v-icon class="mx-5" color="blue-darken-2" icon="mdi-vuetify" size="x-large" />
    </div>
  </div>
</template>

<style scoped>
section {
  color: #213547;
}

.tagline {
  font-size: 76px;
  line-height: 1.25;
  font-weight: 900;
  letter-spacing: -1.5px;
  max-width: 960px;
  margin: 0 auto;
}

.accent {
  background: -webkit-linear-gradient(315deg, #42d392 25%, #647eff);
  background-clip: text;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
}

.description {
  max-width: 960px;
  line-height: 1.5;
  transition: color 0.5s;
  font-size: 22px;
  margin: 24px auto 40px;
}
</style>
