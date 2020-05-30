const path = require('path');

module.exports = {
  // devServer: {
  //   proxy: {
  //     '/jiwon': {
  //       target: "http://localhost:9000",
  //       ws: true,
  //       changeOrigin: true
  //     }
  //   }
  // },
  css: {
    // Enable CSS source maps.
    sourceMap: process.env.NODE_ENV !== 'production'
  },
  outputDir: path.resolve(__dirname, "../src/main/resources/static"),
  configureWebpack: {
    resolve: {
        alias: {
            '@': path.join(__dirname, 'src/')
          }
      }
  }
};
