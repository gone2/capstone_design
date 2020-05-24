const path = require('path');

module.exports = {
  css: {
    // Enable CSS source maps.
    sourceMap: process.env.NODE_ENV !== 'production'
  },
  configureWebpack: {
    resolve: {
        alias: {
            '@': path.join(__dirname, 'src/')
          }
      }
  }
};
