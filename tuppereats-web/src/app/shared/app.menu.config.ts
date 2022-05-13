import { MenuRootItem } from 'ontimize-web-ngx';

export const MENU_CONFIG: MenuRootItem[] = [
  { id: 'home', name: 'HOME', icon: 'home', route: '/main/home' },
  { id: 'plates', name: 'PLATES', icon: 'fastfood', route: '/main/products' },
  { id: 'menus', name: 'MENUS', icon: 'restaurant_menu', route: '/main/menus' },
  { id: 'logout', name: 'LOGOUT', route: '/login', icon: 'power_settings_new', confirm: 'yes' }
];
