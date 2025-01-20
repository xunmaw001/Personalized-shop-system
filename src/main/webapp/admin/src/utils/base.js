const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm3rc1k/",
            name: "ssm3rc1k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3rc1k/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SSM的个性化商铺系统"
        } 
    }
}
export default base
