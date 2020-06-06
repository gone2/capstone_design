const path = require('path');

module.exports = {
  devServer: {
    proxy: "http://localhost:9000"
  },
  css: {
    // Enable CSS source maps.
    sourceMap: process.env.NODE_ENV !== 'production'
  },
  outputDir: path.resolve(__dirname, "../back-End/project/src/main/resources/static"),
  configureWebpack: {
    resolve: {
        alias: {
            '@': path.join(__dirname, 'src/')
          }
      }
  }
};
