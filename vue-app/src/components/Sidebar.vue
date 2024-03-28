<script setup lang="ts">
const props = defineProps<{
  drawer: boolean
}>()

interface Item {
  title: string
  icon: string
  to: string
}

const items: Item[] = [
  { title: '首頁', icon: 'mdi-page-layout-header', to: '/index' },
  { title: '個人資料', icon: 'mdi-account', to: '/supervisors' },
  { title: '代辦事項', icon: 'mdi-checkbox-marked-circle-plus-outline', to: '/clockin' }
]
</script>

<template>
  <v-navigation-drawer v-model="props.drawer" class="bg-grey-lighten-5">
    <v-list nav>
      <v-list-item
        v-for="item in items"
        :prepend-icon="item.icon"
        :title="item.title"
        :to="item.to"
      ></v-list-item>
    </v-list>
    <template v-slot:append>
      <div class="pa-2">
        <v-btn block> 登出 </v-btn>
      </div>
    </template>
  </v-navigation-drawer>
</template>

<style scoped></style>
