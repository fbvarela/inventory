const app = new Vue({

    el: '#inventory',
    data: {
        inventory: null
    },

    async mounted() {
        await axios.get("http://localhost:8080/repository")
            .then(response => {
                this.inventory = response.data
                console.log(this.inventory)
            }).catch(error => console.log(error))
    }
})

