import { MenuRootItem } from 'ontimize-web-ngx';
export const MENU_CONFIG: MenuRootItem[] = [
  { id: 'home', name: 'HOME', icon: 'home', route: '/main/home' },
  { id: 'plates', name: 'PLATES', icon: 'fastfood', route: '/main/products' },
  { id: 'menus', name: 'MENUS', icon: 'restaurant_menu', route: '/main/menus' },
  { id: 'users', name: 'USERS', icon: 'business_center', route: '/main/users' },
  { id: 'customers', name: 'CUSTOMERS', icon: 'people', route: '/main/customers' },
  { id: 'suscriptions', name: 'SUSCRIPTIONS', icon: 'shopping_cart', route: '/main/suscriptions' },
  { id: 'logout', name: 'LOGOUT', route: '/login', icon: 'power_settings_new', confirm: 'yes' }
];

